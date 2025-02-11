class TextEditor{
    public static void main(String[] args) {
        TextState editor = new TextState();
        editor.addState("Kunal");
        editor.addState("Kunal chaudhary");        
        editor.displayCurrentState();  
        editor.undo();
        editor.displayCurrentState();
        editor.undo();
        editor.displayCurrentState();
        editor.redo();
        editor.displayCurrentState();
        editor.redo();
        editor.displayCurrentState();
        editor.undo();
        editor.undo();
        editor.undo();
        editor.redo();
        editor.displayCurrentState();
        editor.redo();
        editor.displayCurrentState();
    }
}
class TextState {
    private TextState head, tail, current;
    private String text;
    private TextState next, prev;
    private int history = 0;
    private final int MAX_HISTORY = 5;

    public TextState() {
        this.text = "";
        this.next = this.prev = null;
    }
    public void addState(String text) {
        TextState newState = new TextState();
        newState.text = text;

        if (current == null)
            head = tail = current = newState;
        else {
            current.next = null;
            newState.prev = current;
            current.next = newState;
            current = newState;

            history++;
            if (history > MAX_HISTORY) {
                head = head.next;
                head.prev = null;
                history--;
            }
        }
    }

    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("Undo not possible.");
        }
    }
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("Redo not possible.");
        }
    }
    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current Text: " + current.text);
        } else {
            System.out.println("No text available.");
        }
    }
}