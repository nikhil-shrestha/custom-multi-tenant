package demo

import groovy.util.logging.Slf4j

@Slf4j
class BootStrap {

  def init = { servletContext ->

    log.info "Loading database..."
    createUsers()
  }
  def destroy = {
  }


  def createUsers() {
    if (User.count() == 0) {
      log.info "Creating Users..."

      def adminRole = new Role(authority: 'ROLE_ADMIN').save()
      def adminUser = new User(username: 'admin', password: '123456').save()

      UserRole.create adminUser, adminRole

      UserRole.withSession {
        it.flush()
        it.clear()
      }

      def companyRole = new Role(authority: 'ROLE_VILLAIN').save()
      def companyUser = new User(username: 'villain', password: '123456').save()

      UserRole.create companyUser, companyRole

      UserRole.withSession {
        it.flush()
        it.clear()
      }
    }
  }
}
