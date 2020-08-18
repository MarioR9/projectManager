package pm.api


import grails.rest.*
import grails.converters.*

class ProjectController {
	static responseFormats = ['json', 'xml']
	
    def index(Integer max) { 
       params.max = Math.min(max ?: 10, 100)
       respond Project.list(params)
    }
    def show(Long id){
      respond User.get(id)
    }
    def create() {
      respond new Project(params)
    }
    def delete(Long id)) {
      p = Project.get(id)
      p.delete()
    }
}
