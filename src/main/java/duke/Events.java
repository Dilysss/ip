package duke;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Represents an events task to be added to Duke with a event date.
 */
public class Events extends Task {

    private LocalDateTime dateTime;

    public Events(String description, LocalDateTime dateTime) {
        super(description);
        this.dateTime = dateTime;
    }

    /**
     * Returns string of formatted deadline.
     *
     * @return Formatted deadline.
     */
    private String dateStr() {
        String formatDateTime = this.dateTime.format(DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm"));
        return formatDateTime;
    }

    /**
     * Returns string of data to be saved.
     *
     * @return Data to be saved.
     */
    @Override
    public String printSavedData() {
        return "E | " + super.printSavedData() + dateStr() + "\n";
    }

    /**
     * Returns string of event shown on Duke bot.
     *
     * @return event shown on Duke bot.
     */
    @Override
    public String toString() {
        return "[E]" + super.toString() + "(at: " + dateStr() + ")";
    }
}
