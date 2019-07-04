package firstgrailsgradle

import grails.plugin.springsecurity.SpringSecurityService
import grails.plugin.springsecurity.annotation.Secured
import grails.plugin.springsecurity.userdetails.GrailsUser
import groovy.transform.CompileStatic

@CompileStatic
@Secured("isAuthenticated()")
class HomeController {

    UserDataService userDataService

    static responseFormats = ['json']

    SpringSecurityService springSecurityService

    def index() {
        def username = loggedUsername()
        render view: 'index', model: [username: username]
    }

    int count() {
        int count = userDataService.count()
        render count.toString()
    }

    String loggedUsername() {
        if (springSecurityService.principal == null) {
            return null
        }
        if(springSecurityService.principal instanceof String){
            return springSecurityService.principal
        }
        if (springSecurityService.principal instanceof GrailsUser){
            return ((GrailsUser) springSecurityService.principal).username
        }
    }
}
