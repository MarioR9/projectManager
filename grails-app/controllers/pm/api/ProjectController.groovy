package pm.api


import grails.rest.*
import grails.converters.*

class ProjectController {
	static responseFormats = ['json', 'xml']
	
    def index() { 
       response(Project.list())
    }
}
