package pm.api

import grails.gorm.transactions.*
import static org.springframework.http.HttpStatus.*
import static org.springframework.http.HttpMethod.*
import grails.validation.ValidationException

import grails.rest.*
import grails.converters.*



class ProjectController {
	static responseFormats = ['json', 'xml']

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
  
    
    def projectService

    def index(Integer max) {
       params.max = Math.min(max ?: 10, 100)
       respond Project.list(params)
    }
 
    def show(Long id) {
        respond projectService.get(id)
    }
 
    def create() {
        respond new Project(params)
    }
 
    def save(Project project) {
        def proc = projectService
        proc.save(project)
        respond proc
    }
 
    def delete(Long id) {
        projectService.delete(id)
        respond Project.list(params)
    }
}
