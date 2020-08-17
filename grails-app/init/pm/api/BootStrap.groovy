package pm.api

class BootStrap {

    def init = { servletContext ->
        new Project(
         name: "TranslateMe Mobile 1",
         description: "Object recognition to translate objects using phone's camera",
         startDate: "August",
         endDate: "September",
         collaborators: 2,
         githubLink: "google.com").save()
        new Project(
         name: "TranslateMe Mobile 2",
         description: "Object recognition to translate objects using phone's camera",
         startDate: "August",
         endDate: "September",
         collaborators: 2,
         githubLink: "google.com").save()
        new Project(
         name: "TranslateMe Mobile 3",
         description: "Object recognition to translate objects using phone's camera",
         startDate: "August",
         endDate: "September",
         collaborators: 2,
         githubLink: "google.com").save()
        new User(
         name: "Charlie",
         bio: "the new guy",
         projects: 1).save() 
        new User(
         name: "Larry",
         bio: "the new guy",
         projects: 1).save() 
        new User(
         name: "Steven",
         bio: "the new guy",
         projects: 1).save() 
    }
 
    def destroy = {
    }
}
