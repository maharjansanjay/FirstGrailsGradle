package firstgrailsgradle

class RegisterController {

    UserDataService userDataService

    static allowedMethods = [register: 'POST',
                                index: 'GET']

    def index() {
        render view: "index"
    }


    def register(String username, String password, String firstname, String lastname) {
        userDataService.save(username, password,firstname,lastname, true, false, false, false)
        redirect(controller:'login', action:'auth')
    }
}
