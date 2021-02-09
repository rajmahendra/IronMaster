
import java.nio.file.Paths
import org.tomlj.*

fun main() {

    val source = Paths.get("character-sheet.toml")
    val result: TomlParseResult = Toml.parse(source)
    result.errors().forEach { error -> System.err.println(error.toString()) }

    val value: Any? = result.get("stats.edge")
    println (value)
}