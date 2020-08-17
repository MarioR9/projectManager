package pm.api


import grails.rest.*
import grails.converters.*

class UserController {
	static responseFormats = ['json', 'xml']
	
     def index(Integer max) { 
       params.max = Math.min(max ?: 10, 100)
       respond User.list(params)
    }
}
