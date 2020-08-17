package pm.api

class User {

    String name
    String bio
    Integer projects

    static constraints = {
        name blank:false
    }
}
