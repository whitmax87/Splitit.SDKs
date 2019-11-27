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
    instance = new SplititWebApiPublic.InstallmentPlanApi();
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

  describe('InstallmentPlanApi', function() {
    describe('installmentPlanApprove', function() {
      it('should call installmentPlanApprove successfully', function(done) {
        //uncomment below and update the code to test installmentPlanApprove
        //instance.installmentPlanApprove(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('installmentPlanCancel', function() {
      it('should call installmentPlanCancel successfully', function(done) {
        //uncomment below and update the code to test installmentPlanCancel
        //instance.installmentPlanCancel(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('installmentPlanCreate', function() {
      it('should call installmentPlanCreate successfully', function(done) {
        //uncomment below and update the code to test installmentPlanCreate
        //instance.installmentPlanCreate(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('installmentPlanGet', function() {
      it('should call installmentPlanGet successfully', function(done) {
        //uncomment below and update the code to test installmentPlanGet
        //instance.installmentPlanGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('installmentPlanInitiate', function() {
      it('should call installmentPlanInitiate successfully', function(done) {
        //uncomment below and update the code to test installmentPlanInitiate
        //instance.installmentPlanInitiate(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('installmentPlanRefund', function() {
      it('should call installmentPlanRefund successfully', function(done) {
        //uncomment below and update the code to test installmentPlanRefund
        //instance.installmentPlanRefund(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('installmentPlanStartInstallments', function() {
      it('should call installmentPlanStartInstallments successfully', function(done) {
        //uncomment below and update the code to test installmentPlanStartInstallments
        //instance.installmentPlanStartInstallments(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('installmentPlanUpdate', function() {
      it('should call installmentPlanUpdate successfully', function(done) {
        //uncomment below and update the code to test installmentPlanUpdate
        //instance.installmentPlanUpdate(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('installmentPlanVerifyPayment', function() {
      it('should call installmentPlanVerifyPayment successfully', function(done) {
        //uncomment below and update the code to test installmentPlanVerifyPayment
        //instance.installmentPlanVerifyPayment(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
