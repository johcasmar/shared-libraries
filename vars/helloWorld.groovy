def called(Map config {
      sh("echo config $hola") 
    //sh ("echo Hello ${name}., today is ${dayofweek}.)" 
    // sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
}
def call(String name = 'human') {
        echo "Hello, ${name}."
}
