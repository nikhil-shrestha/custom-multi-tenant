package demo


import grails.rest.*
import grails.converters.*
import groovy.transform.CompileStatic

@CompileStatic
class PlanController {
	static responseFormats = ['json', 'xml']
  PlanDataService planDataService

  def index() {
    [planList: planDataService.findAll()]
  }
}
