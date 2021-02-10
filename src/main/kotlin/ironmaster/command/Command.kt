package ironmaster.command

interface Command {
    fun execute(args: Array<String>);
}