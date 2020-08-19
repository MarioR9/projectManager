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

    def show(Long id) {
        respond project.get(id)
    }

    def create() {
        respond new Project(params)
    }

    def save(Project project) {
        if (project == null) {
            notFound()
            return
        }

        try {
            project.save(project)
        } catch (ValidationException e) {
            respond project.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'project.label', default: 'Project'), project.id])
                redirect project
            }
            '*' { respond project, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond project.get(id)
    }

    def update(Project project) {
        if (project == null) {
            notFound()
            return
        }

        try {
            project.save(project)
        } catch (ValidationException e) {
            respond project.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'project.label', default: 'Project'), project.id])
                redirect project
            }
            '*'{ respond project, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        project.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'project.label', default: 'Project'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'project.label', default: 'Project'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }

}
