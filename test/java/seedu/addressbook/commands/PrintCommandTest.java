package seedu.addressbook.commands;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrintCommandTest {

    @Test
    public void execute() {
        PrintCommand command = new PrintCommand();
        CommandResult result = command.execute();

        assertEquals(PrintCommand.MESSAGE_PRINT, result.feedbackToUser);
    }

}
