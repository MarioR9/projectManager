package pm.api

class UrlMappings {

    static mappings = {
        
@       @Resource(uri="/api/projects")

        "/"(controller: 'application', action: 'index')

        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
