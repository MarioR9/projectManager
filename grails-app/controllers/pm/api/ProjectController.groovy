package pm.api


import grails.rest.*
import grails.converters.*

class ProjectController {
	static responseFormats = ['json', 'xml']
	
    def index(Integer max) { 
        params.max = Math.min(max ?: 10,100)
        response Project.list(params)
    }
}
