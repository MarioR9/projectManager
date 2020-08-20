package pm.api

class UrlMappings {

    static mappings = {

        "/api/projects"(controller: "project", action: "index", method:"GET")
        "/api/projects/$id"(controller: "project", action: "show", method:"GET")

        "/api/projects"(controller: "project", action: "save", method:"POST")
        "/api/projects/$id"(controller: "project", action: "update", method:"PUT")

        "/api/projects/$id"(controller: "project", action: "delete", method:"DELETE")

        "/api/users"(resources: 'user')
        
        "/"(controller: 'application', action: 'index')

        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
