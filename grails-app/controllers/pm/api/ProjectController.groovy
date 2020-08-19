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
      respond Project.get(id)
    }
    def create() {
      respond new Project(params)
    }
    def save(){
      println("here are the params: " + params)
      println(Project.all)
      def project = new Project(params)
        project.save 
    }
  
      def delete() {
        println("here are the params: " + params.id)
        def project = Project.get(params.id)
        project.delete
        response {objc: "deleteded"}
        
    }


}
