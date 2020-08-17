package pm.api

class User {

    String name
    String bio
    Integer projects

    static hasMany =[
        projects: Project
    ]
    
    static constraints = {
        name blank:false
    }
}
