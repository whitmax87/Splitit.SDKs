# coding: utf-8

"""
    splitit-web-api-public

    No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)  # noqa: E501

    OpenAPI spec version: 1.0.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six


class ResponseError(object):
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
        'field_name': 'str',
        'message': 'str'
    }

    attribute_map = {
        'error_code': 'ErrorCode',
        'field_name': 'FieldName',
        'message': 'Message'
    }

    def __init__(self, error_code=None, field_name=None, message=None):  # noqa: E501
        """ResponseError - a model defined in Swagger"""  # noqa: E501

        self._error_code = None
        self._field_name = None
        self._message = None
        self.discriminator = None

        if error_code is not None:
            self.error_code = error_code
        if field_name is not None:
            self.field_name = field_name
        if message is not None:
            self.message = message

    @property
    def error_code(self):
        """Gets the error_code of this ResponseError.  # noqa: E501


        :return: The error_code of this ResponseError.  # noqa: E501
        :rtype: str
        """
        return self._error_code

    @error_code.setter
    def error_code(self, error_code):
        """Sets the error_code of this ResponseError.


        :param error_code: The error_code of this ResponseError.  # noqa: E501
        :type: str
        """

        self._error_code = error_code

    @property
    def field_name(self):
        """Gets the field_name of this ResponseError.  # noqa: E501


        :return: The field_name of this ResponseError.  # noqa: E501
        :rtype: str
        """
        return self._field_name

    @field_name.setter
    def field_name(self, field_name):
        """Sets the field_name of this ResponseError.


        :param field_name: The field_name of this ResponseError.  # noqa: E501
        :type: str
        """

        self._field_name = field_name

    @property
    def message(self):
        """Gets the message of this ResponseError.  # noqa: E501


        :return: The message of this ResponseError.  # noqa: E501
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message):
        """Sets the message of this ResponseError.


        :param message: The message of this ResponseError.  # noqa: E501
        :type: str
        """

        self._message = message

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
        if issubclass(ResponseError, dict):
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
        if not isinstance(other, ResponseError):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
