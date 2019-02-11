package seedu.addressbook.commands;

public class PrintCommand extends Command{

    public static final String COMMAND_WORD = "print";

    public static final String MESSAGE_PRINT = "Hi, this is address book level 2.";

    @Override
    public CommandResult execute() {
        return new CommandResult(MESSAGE_PRINT);
    }
}
