public class SocialMedia {
    public static void main(String[] args) {
        User head = null;
        head = User.addUser(101, "Kunal", 22, head);
        head = User.addUser(102, "Arush", 23, head);
        head = User.addUser(103, "Ayush", 24, head);
        
        User.addFriend(101, 102, head);
        User.addFriend(101, 103, head);
        User.addFriend(102, 103, head);
        
        User.displayFriends(101, head);
        User.displayFriends(102, head);
        
        User.findMutualFriends(101, 102, head);
        
        User.removeFriend(101, 103, head);
        User.displayFriends(101, head);
    }
}

class User {
    int userId;
    String name;
    int age;
    FriendNode friends;
    User next;
    
    public User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = null;
        this.next = null;
    }
    
    public static User addUser(int userId, String name, int age, User head) {
        User newUser = new User(userId, name, age);
        newUser.next = head;
        return newUser;
    }
    
    public static void addFriend(int userId1, int userId2, User head) {
        User user1 = findUser(userId1, head);
        User user2 = findUser(userId2, head);
        if (user1 != null && user2 != null) {
            user1.friends = new FriendNode(userId2, user1.friends);
            user2.friends = new FriendNode(userId1, user2.friends);
        }
    }
    
    public static void removeFriend(int userId1, int userId2, User head) {
        User user1 = findUser(userId1, head);
        User user2 = findUser(userId2, head);
        if (user1 != null) {
            user1.friends = FriendNode.removeFriend(userId2, user1.friends);
        }
        if (user2 != null) {
            user2.friends = FriendNode.removeFriend(userId1, user2.friends);
        }
    }
    
    public static void displayFriends(int userId, User head) {
        User user = findUser(userId, head);
        if (user != null) {
            System.out.print(user.name + "'s Friends: ");
            FriendNode temp = user.friends;
            while (temp != null) {
                System.out.print(temp.friendId + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    
    public static void findMutualFriends(int userId1, int userId2, User head) {
        User user1 = findUser(userId1, head);
        User user2 = findUser(userId2, head);
        if (user1 != null && user2 != null) {
            System.out.print("Mutual Friends between " + user1.name + " and " + user2.name + ": ");
            FriendNode temp1 = user1.friends;
            while (temp1 != null) {
                FriendNode temp2 = user2.friends;
                while (temp2 != null) {
                    if (temp1.friendId == temp2.friendId) {
                        System.out.print(temp1.friendId + " ");
                    }
                    temp2 = temp2.next;
                }
                temp1 = temp1.next;
            }
            System.out.println();
        }
    }
    
    public static User findUser(int userId, User head) {
        while (head != null) {
            if (head.userId == userId) {
                return head;
            }
            head = head.next;
        }
        return null;
    }
}

class FriendNode {
    int friendId;
    FriendNode next;
    
    public FriendNode(int friendId, FriendNode next) {
        this.friendId = friendId;
        this.next = next;
    }
    
    public static FriendNode removeFriend(int friendId, FriendNode head) {
        if (head == null) return null;
        if (head.friendId == friendId) return head.next;
        FriendNode temp = head;
        while (temp.next != null && temp.next.friendId != friendId) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
        return head;
    }
}
