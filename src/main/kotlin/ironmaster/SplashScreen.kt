package ironmaster

object SplashScreen {
 fun displaySplash() {
     var splashString = """
 

ooooo                                ooo        ooooo                        .                      
`888'                                `88.       .888'                      .o8                      
 888  oooo d8b  .ooooo.  ooo. .oo.    888b     d'888   .oooo.    .oooo.o .o888oo  .ooooo.  oooo d8b 
 888  `888""8P d88' `88b `888P"Y88b   8 Y88. .P  888  `P  )88b  d88(  "8   888   d88' `88b `888""8P 
 888   888     888   888  888   888   8  `888'   888   .oP"888  `"Y88b.    888   888ooo888  888     
 888   888     888   888  888   888   8    Y     888  d8(  888  o.  )88b   888 . 888    .o  888     
o888o d888b    `Y8bod8P' o888o o888o o8o        o888o `Y888""8o 8""888P'   "888" `Y8bod8P' d888b    
                                                                 IronMaster (Preview) 0.0.1 SNAPSHOT

     """.trimIndent()
println(splashString)
 }
}