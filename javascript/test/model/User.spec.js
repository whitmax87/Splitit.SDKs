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
    instance = new SplititWebApiPublic.User();
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

  describe('User', function() {
    it('should create an instance of User', function() {
      // uncomment below and update the code to test User
      //var instane = new SplititWebApiPublic.User();
      //expect(instance).to.be.a(SplititWebApiPublic.User);
    });

    it('should have the property id (base name: "Id")', function() {
      // uncomment below and update the code to test the property id
      //var instane = new SplititWebApiPublic.User();
      //expect(instance).to.be();
    });

    it('should have the property userName (base name: "UserName")', function() {
      // uncomment below and update the code to test the property userName
      //var instane = new SplititWebApiPublic.User();
      //expect(instance).to.be();
    });

    it('should have the property fullName (base name: "FullName")', function() {
      // uncomment below and update the code to test the property fullName
      //var instane = new SplititWebApiPublic.User();
      //expect(instance).to.be();
    });

    it('should have the property email (base name: "Email")', function() {
      // uncomment below and update the code to test the property email
      //var instane = new SplititWebApiPublic.User();
      //expect(instance).to.be();
    });

    it('should have the property phoneNumber (base name: "PhoneNumber")', function() {
      // uncomment below and update the code to test the property phoneNumber
      //var instane = new SplititWebApiPublic.User();
      //expect(instance).to.be();
    });

    it('should have the property cultureName (base name: "CultureName")', function() {
      // uncomment below and update the code to test the property cultureName
      //var instane = new SplititWebApiPublic.User();
      //expect(instance).to.be();
    });

    it('should have the property roleName (base name: "RoleName")', function() {
      // uncomment below and update the code to test the property roleName
      //var instane = new SplititWebApiPublic.User();
      //expect(instance).to.be();
    });

    it('should have the property isLocked (base name: "IsLocked")', function() {
      // uncomment below and update the code to test the property isLocked
      //var instane = new SplititWebApiPublic.User();
      //expect(instance).to.be();
    });

    it('should have the property isDataRestricted (base name: "IsDataRestricted")', function() {
      // uncomment below and update the code to test the property isDataRestricted
      //var instane = new SplititWebApiPublic.User();
      //expect(instance).to.be();
    });

  });

}));
