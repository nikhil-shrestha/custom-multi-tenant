import demo.CurrentUserByJwtTenantResolver
import demo.UserPasswordEncoderListener
// Place your Spring DSL code here
beans = {
    userPasswordEncoderListener(UserPasswordEncoderListener)
    currentUserByJwtTenantResolver(CurrentUserByJwtTenantResolver)
}
