def call(Map config = [:]) {
      // sh "Hello World" 
    sh "echo Hello ${name}., today is ${dayofweek}." 
    // sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
}
