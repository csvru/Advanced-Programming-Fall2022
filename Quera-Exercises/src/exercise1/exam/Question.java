package exercise1.exam;

public class Question {
    private final String title;
    private final String[] choices;
    private boolean _isActive = true;
    private final int key;
    private final int mark;

    public Question(String title, String[] choices, int key, int mark) {
        this.title = title;
        this.choices = choices;
        this.key = key;
        this.mark = mark;
        if (this.key < 0 || this.key >= this.choices.length) {
            this._isActive = false;
        }
    }

    public Question active() {
        if (this.key < 0 || this.key >= this.choices.length) {
            return this;
        }
        this._isActive = true;
        return this;
    }

    public Question inactive() {
        this._isActive = false;
        return this;
    }

    public boolean isActive() {
        return this._isActive;
    }

    public String show() {
        return String.format("%s (%s)\n%s", this.title, "mark: " + mark, this.showChoices());
    }

    private String showChoices() {
        // we should replace it with StringBuilder
        String string = "";
        for (int index = 0; index < this.choices.length; index++) {
            string += index + ") " + this.choices[index] + "\n";
        }
        return string;
    }

    public int answer(int choice) {
        if (!this._isActive) {
            return -1;
        }
        if (choice < 0 || choice >= this.choices.length) {
            return -1;
        }
        return this.key == choice ? this.mark : 0;
    }
}
