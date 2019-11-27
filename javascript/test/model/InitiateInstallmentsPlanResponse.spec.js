/**
 * splitit-web-api-public
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.SplititWebApiPublic);
  }
}(this, function(expect, SplititWebApiPublic) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new SplititWebApiPublic.InitiateInstallmentsPlanResponse();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('InitiateInstallmentsPlanResponse', function() {
    it('should create an instance of InitiateInstallmentsPlanResponse', function() {
      // uncomment below and update the code to test InitiateInstallmentsPlanResponse
      //var instane = new SplititWebApiPublic.InitiateInstallmentsPlanResponse();
      //expect(instance).to.be.a(SplititWebApiPublic.InitiateInstallmentsPlanResponse);
    });

    it('should have the property responseHeader (base name: "ResponseHeader")', function() {
      // uncomment below and update the code to test the property responseHeader
      //var instane = new SplititWebApiPublic.InitiateInstallmentsPlanResponse();
      //expect(instance).to.be();
    });

    it('should have the property installmentPlan (base name: "InstallmentPlan")', function() {
      // uncomment below and update the code to test the property installmentPlan
      //var instane = new SplititWebApiPublic.InitiateInstallmentsPlanResponse();
      //expect(instance).to.be();
    });

    it('should have the property checkoutUrl (base name: "CheckoutUrl")', function() {
      // uncomment below and update the code to test the property checkoutUrl
      //var instane = new SplititWebApiPublic.InitiateInstallmentsPlanResponse();
      //expect(instance).to.be();
    });

    it('should have the property approvalUrl (base name: "ApprovalUrl")', function() {
      // uncomment below and update the code to test the property approvalUrl
      //var instane = new SplititWebApiPublic.InitiateInstallmentsPlanResponse();
      //expect(instance).to.be();
    });

    it('should have the property termsAndConditionsUrl (base name: "TermsAndConditionsUrl")', function() {
      // uncomment below and update the code to test the property termsAndConditionsUrl
      //var instane = new SplititWebApiPublic.InitiateInstallmentsPlanResponse();
      //expect(instance).to.be();
    });

    it('should have the property installmentPlanInfoUrl (base name: "InstallmentPlanInfoUrl")', function() {
      // uncomment below and update the code to test the property installmentPlanInfoUrl
      //var instane = new SplititWebApiPublic.InitiateInstallmentsPlanResponse();
      //expect(instance).to.be();
    });

    it('should have the property publicToken (base name: "PublicToken")', function() {
      // uncomment below and update the code to test the property publicToken
      //var instane = new SplititWebApiPublic.InitiateInstallmentsPlanResponse();
      //expect(instance).to.be();
    });

  });

}));
