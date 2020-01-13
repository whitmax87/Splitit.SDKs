# coding: utf-8

"""
    splitit-web-api-public-sdk

    No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)  # noqa: E501

    OpenAPI spec version: 1.0.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six


class ResponseStatus(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'error_code': 'str',
        'message': 'str',
        'stack_trace': 'str',
        'errors': 'list[ResponseError]'
    }

    attribute_map = {
        'error_code': 'ErrorCode',
        'message': 'Message',
        'stack_trace': 'StackTrace',
        'errors': 'Errors'
    }

    def __init__(self, error_code=None, message=None, stack_trace=None, errors=None):  # noqa: E501
        """ResponseStatus - a model defined in Swagger"""  # noqa: E501

        self._error_code = None
        self._message = None
        self._stack_trace = None
        self._errors = None
        self.discriminator = None

        if error_code is not None:
            self.error_code = error_code
        if message is not None:
            self.message = message
        if stack_trace is not None:
            self.stack_trace = stack_trace
        if errors is not None:
            self.errors = errors

    @property
    def error_code(self):
        """Gets the error_code of this ResponseStatus.  # noqa: E501


        :return: The error_code of this ResponseStatus.  # noqa: E501
        :rtype: str
        """
        return self._error_code

    @error_code.setter
    def error_code(self, error_code):
        """Sets the error_code of this ResponseStatus.


        :param error_code: The error_code of this ResponseStatus.  # noqa: E501
        :type: str
        """

        self._error_code = error_code

    @property
    def message(self):
        """Gets the message of this ResponseStatus.  # noqa: E501


        :return: The message of this ResponseStatus.  # noqa: E501
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message):
        """Sets the message of this ResponseStatus.


        :param message: The message of this ResponseStatus.  # noqa: E501
        :type: str
        """

        self._message = message

    @property
    def stack_trace(self):
        """Gets the stack_trace of this ResponseStatus.  # noqa: E501


        :return: The stack_trace of this ResponseStatus.  # noqa: E501
        :rtype: str
        """
        return self._stack_trace

    @stack_trace.setter
    def stack_trace(self, stack_trace):
        """Sets the stack_trace of this ResponseStatus.


        :param stack_trace: The stack_trace of this ResponseStatus.  # noqa: E501
        :type: str
        """

        self._stack_trace = stack_trace

    @property
    def errors(self):
        """Gets the errors of this ResponseStatus.  # noqa: E501


        :return: The errors of this ResponseStatus.  # noqa: E501
        :rtype: list[ResponseError]
        """
        return self._errors

    @errors.setter
    def errors(self, errors):
        """Sets the errors of this ResponseStatus.


        :param errors: The errors of this ResponseStatus.  # noqa: E501
        :type: list[ResponseError]
        """

        self._errors = errors

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(ResponseStatus, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, ResponseStatus):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other