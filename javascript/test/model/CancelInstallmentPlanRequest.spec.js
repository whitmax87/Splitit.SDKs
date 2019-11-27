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
    instance = new SplititWebApiPublic.CancelInstallmentPlanRequest();
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

  describe('CancelInstallmentPlanRequest', function() {
    it('should create an instance of CancelInstallmentPlanRequest', function() {
      // uncomment below and update the code to test CancelInstallmentPlanRequest
      //var instane = new SplititWebApiPublic.CancelInstallmentPlanRequest();
      //expect(instance).to.be.a(SplititWebApiPublic.CancelInstallmentPlanRequest);
    });

    it('should have the property requestHeader (base name: "RequestHeader")', function() {
      // uncomment below and update the code to test the property requestHeader
      //var instane = new SplititWebApiPublic.CancelInstallmentPlanRequest();
      //expect(instance).to.be();
    });

    it('should have the property installmentPlanNumber (base name: "InstallmentPlanNumber")', function() {
      // uncomment below and update the code to test the property installmentPlanNumber
      //var instane = new SplititWebApiPublic.CancelInstallmentPlanRequest();
      //expect(instance).to.be();
    });

    it('should have the property refundUnderCancelation (base name: "RefundUnderCancelation")', function() {
      // uncomment below and update the code to test the property refundUnderCancelation
      //var instane = new SplititWebApiPublic.CancelInstallmentPlanRequest();
      //expect(instance).to.be();
    });

    it('should have the property cancelationReason (base name: "CancelationReason")', function() {
      // uncomment below and update the code to test the property cancelationReason
      //var instane = new SplititWebApiPublic.CancelInstallmentPlanRequest();
      //expect(instance).to.be();
    });

    it('should have the property isExecutedUnattended (base name: "IsExecutedUnattended")', function() {
      // uncomment below and update the code to test the property isExecutedUnattended
      //var instane = new SplititWebApiPublic.CancelInstallmentPlanRequest();
      //expect(instance).to.be();
    });

  });

}));
