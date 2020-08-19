package pm.api

import grails.gorm.transactions.*
import static org.springframework.http.HttpStatus.*
import static org.springframework.http.HttpMethod.*

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
      def newproject = new Project(params)
        newproject.save(flush: true)
    }
  
@Transactional
def save(Project project) {
  project = new Project(params) 
  project.save flush:true
    
}

  def delete() {
    def project = Project.get(params.id)
    project.delete(flush: true)
        
  }


}
