package firstgrailsgradle

import grails.plugin.springsecurity.annotation.Authorities
import grails.plugin.springsecurity.annotation.Secured
import groovy.transform.CompileStatic

@CompileStatic
class AdminController {

    def index() {
        render(view:'index')
    }
}
