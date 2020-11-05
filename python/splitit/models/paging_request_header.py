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


class PagingRequestHeader(object):
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
        'skip': 'int',
        'take': 'int'
    }

    attribute_map = {
        'skip': 'Skip',
        'take': 'Take'
    }

    def __init__(self, skip=None, take=None):  # noqa: E501
        """PagingRequestHeader - a model defined in Swagger"""  # noqa: E501

        self._skip = None
        self._take = None
        self.discriminator = None

        self.skip = skip
        self.take = take

    @property
    def skip(self):
        """Gets the skip of this PagingRequestHeader.  # noqa: E501


        :return: The skip of this PagingRequestHeader.  # noqa: E501
        :rtype: int
        """
        return self._skip

    @skip.setter
    def skip(self, skip):
        """Sets the skip of this PagingRequestHeader.


        :param skip: The skip of this PagingRequestHeader.  # noqa: E501
        :type: int
        """
        
        if skip is None:
            raise ValueError("Invalid value for `skip`, must not be `None`")  # noqa: E501

        self._skip = skip

    @property
    def take(self):
        """Gets the take of this PagingRequestHeader.  # noqa: E501


        :return: The take of this PagingRequestHeader.  # noqa: E501
        :rtype: int
        """
        return self._take

    @take.setter
    def take(self, take):
        """Sets the take of this PagingRequestHeader.


        :param take: The take of this PagingRequestHeader.  # noqa: E501
        :type: int
        """
        
        if take is None:
            raise ValueError("Invalid value for `take`, must not be `None`")  # noqa: E501

        self._take = take

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
        if issubclass(PagingRequestHeader, dict):
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
        if not isinstance(other, PagingRequestHeader):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other