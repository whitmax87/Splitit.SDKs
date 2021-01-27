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


class Installment(object):
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
        '_date': 'datetime',
        'amount': 'MoneyWithCurrencyCode',
        'held_amount': 'float'
    }

    attribute_map = {
        '_date': 'Date',
        'amount': 'Amount',
        'held_amount': 'HeldAmount'
    }

    def __init__(self, _date=None, amount=None, held_amount=None):  # noqa: E501
        """Installment - a model defined in Swagger"""  # noqa: E501

        self.__date = None
        self._amount = None
        self._held_amount = None
        self.discriminator = None

        if _date is not None:
            self._date = _date
        if amount is not None:
            self.amount = amount
        self.held_amount = held_amount

    @property
    def _date(self):
        """Gets the _date of this Installment.  # noqa: E501


        :return: The _date of this Installment.  # noqa: E501
        :rtype: datetime
        """
        return self.__date

    @_date.setter
    def _date(self, _date):
        """Sets the _date of this Installment.


        :param _date: The _date of this Installment.  # noqa: E501
        :type: datetime
        """

        self.__date = _date

    @property
    def amount(self):
        """Gets the amount of this Installment.  # noqa: E501


        :return: The amount of this Installment.  # noqa: E501
        :rtype: MoneyWithCurrencyCode
        """
        return self._amount

    @amount.setter
    def amount(self, amount):
        """Sets the amount of this Installment.


        :param amount: The amount of this Installment.  # noqa: E501
        :type: MoneyWithCurrencyCode
        """

        self._amount = amount

    @property
    def held_amount(self):
        """Gets the held_amount of this Installment.  # noqa: E501


        :return: The held_amount of this Installment.  # noqa: E501
        :rtype: float
        """
        return self._held_amount

    @held_amount.setter
    def held_amount(self, held_amount):
        """Sets the held_amount of this Installment.


        :param held_amount: The held_amount of this Installment.  # noqa: E501
        :type: float
        """
        
        if held_amount is None:
            raise ValueError("Invalid value for `held_amount`, must not be `None`")  # noqa: E501

        self._held_amount = held_amount

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
        if issubclass(Installment, dict):
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
        if not isinstance(other, Installment):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other