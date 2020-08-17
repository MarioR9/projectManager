package pm.api

class UrlMappings {

    static mappings = {

        "/api/projects"(resources: 'project')

        "/"(controller: 'application', action: 'index')

        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
