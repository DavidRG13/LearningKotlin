package advanced

public class UserAdvanced private (val firstName: String)



public open class UserParent (val firstName: String)
public class User (val lastName: String, val a: String) : UserParent(a){}


public class User4 : UserParent{
    constructor(lastName: String, a: String) : super(a){}
    constructor(a: String) : super(a){}
}




public open class BarParent ()
public open class Bar (val a: String) : BarParent(){
    constructor() : this("defaultValue"){}
    constructor(b: Int): this(){}
}

