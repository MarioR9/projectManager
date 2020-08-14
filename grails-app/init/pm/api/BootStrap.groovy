package pm.api

class BootStrap {

    def init = { servletContext ->
        new Project(
                    name: "TranslateMe Mobile",
                    description: "Object recognition to translate objects using phone's camera",
                    startDate: "August",
                    endDate: "September").save()
                    
    }
    def destroy = {
    }
}
