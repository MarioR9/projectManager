package pm.api

class BootStrap {

    def init = { servletContext ->
        new Project(
         name: "TranslateMe",
         description: "Implemented a beautiful user interface employing React with Semantic-React for styling. Developed a Rails API backend. Implemented IBM Visual Recognition to classify images users upload. Implemented IBM Language Translator to translate words users select Utilized Cloudinary to save images users upload",
         startDate: "July 2019",
         endDate: "July 2019",
         githubLink: "https://github.com/MarioR9/TranslateMeFrontend").save()
        new Project(
         name: "TranslateMe Mobile 2",
         description: "Object recognition to translate objects using phone's camera",
         startDate: "August",
         endDate: "September",
         githubLink: "google.com").save()
        new Project(
         name: "TranslateMe Mobile 3",
         description: "Object recognition to translate objects using phone's camera",
         startDate: "August",
         endDate: "September",
         githubLink: "google.com").save()

        new User(
         name: "User 1",
         bio: "Come from nothing to create something great in change the world!",
         projects: 1).save() 
        
    }
 
    def destroy = {
    }
}
