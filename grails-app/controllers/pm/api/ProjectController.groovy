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
  
   def index(Integer max) {
       params.max = Math.min(max ?: 10, 100)
       respond Project.list(params)
    }
    
    def show() {
        respond projectService.single(params)
    }

    
    def save() {
        def project = projectService.save(params)
        respond project
    }

    
    def update() {
        def project = projectService.update(params)
        respond project
    }

    
    def delete() {
        def project = projectService.delete(params)
        respond project
    }
}
