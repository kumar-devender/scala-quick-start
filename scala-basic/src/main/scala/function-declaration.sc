def greeting(name: String): String = {
  s"hello $name !"
}

def greeting2(name: String) = {
  s"hello $name !"
}

def greeting3(fName: String)(lName: String) = {
  s"hello $fName $lName"
}

val result = greeting3("Devender")("Kumar")

def greeting4(name: String)(whoAreYou: () => String) = {
  s"Hello from $name. ${whoAreYou()}"
}


def askName() = {
  "Who are you."
}

val greetingOffice = greeting4("Devender") { () => "Who are you." }

def greeting5(name: String)(implicit mySelf: String): String = {
  s"Hello $name. My name is $mySelf."
}

implicit val mySelf: String = "Devender"

val resultGreeting5 = greeting5("Sam")