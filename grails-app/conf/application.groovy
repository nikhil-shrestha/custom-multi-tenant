

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'demo.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'demo.UserRole'
grails.plugin.springsecurity.authority.className = 'demo.Role'
grails.plugin.springsecurity.securityConfigType = 'InterceptUrlMap'
grails.plugin.springsecurity.interceptUrlMap = [
	[pattern: '/', access: ['permitAll']],
	[pattern: '/error', access: ['permitAll']],
	[pattern: '/index', access: ['permitAll']],
	[pattern: '/index.gsp', access: ['permitAll']],
	[pattern: '/shutdown', access: ['permitAll']],
	[pattern: '/assets/**', access: ['permitAll']],
	[pattern: '/**/js/**', access: ['permitAll']],
	[pattern: '/**/css/**', access: ['permitAll']],
	[pattern: '/**/images/**', access: ['permitAll']],
	[pattern: '/**/favicon.ico', access: ['permitAll']],
	[pattern: '/api/login', access: ['permitAll']],
	[pattern: '/api/validate', access: ['permitAll']],
	[pattern: '/oauth/access_token', access: ['permitAll']],
	[pattern: '/api/plan', access: ['ROLE_VILLAIN']],
	[pattern: '/**', access: ['isFullyAuthenticated()']]

]

grails.plugin.springsecurity.filterChain.chainMap = [
	[pattern: '/api/**', filters: 'JOINED_FILTERS,-anonymousAuthenticationFilter,-exceptionTranslationFilter,-authenticationProcessingFilter,-securityContextPersistenceFilter'],
	[pattern: '/**', filters: 'JOINED_FILTERS,-restTokenValidationFilter,-restExceptionTranslationFilter']
]

grails.plugin.springsecurity.rest.token.storage.jwt.secret = 'qrD6h8K6S9503Q06Y6Rfk21TErImPYqa'

