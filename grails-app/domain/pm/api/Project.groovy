package pm.api

class Project {

    String name
    String description
    String startDate
    String endDate
    Integer collaborators
    String githubLink
    
    static belongsTo = [
        user: User
    ]
    static constraints = {
        //add restrictions
        name blank:false
    }
}
