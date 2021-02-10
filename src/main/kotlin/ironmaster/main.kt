package ironmaster

import java.nio.file.Paths
import org.tomlj.*
import java.io.BufferedReader

import java.io.InputStreamReader
import java.util.*


fun main() {

    val source = Paths.get("character-sheet.toml")
    val result: TomlParseResult = Toml.parse(source)
    result.errors().forEach { error -> System.err.println(error.toString()) }

    val value: Any? = result.get("stats.edge")
    println(value)

    val buffReader = BufferedReader(InputStreamReader(System.`in`))
    val console = System.console()

do {

    print("IronMaster >")
     var cLine = readLine();
  //var commandLine= console.readLine("IronMaster >")

    if (cLine.equals("exit", ignoreCase = true)) {
        println("Goodbye")
        System.exit(0)
    }
     if (cLine == null) continue

    val args = ArrayList<String>()
    val lineSplit = cLine.split(" ").toTypedArray()
    val size = lineSplit.size
    for (i in 0 until size) {
        args.add(lineSplit[i])
    }
    println("Argument list : $size")
    println("Argument : $args")
}while(true)

    }
