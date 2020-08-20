package pm.api

class UrlMappings {

    static mappings = {

        "/api/projects"(resources: 'project')
        "/api/users"(resources: 'user')
        
        "/"(controller: 'application', action: 'index')

        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
