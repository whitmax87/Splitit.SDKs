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


class ConsumerData(object):
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
        'id': 'str',
        'user_name': 'str',
        'full_name': 'str',
        'email': 'str',
        'phone_number': 'str',
        'culture_name': 'str',
        'role_name': 'str',
        'is_locked': 'bool',
        'is_data_restricted': 'bool'
    }

    attribute_map = {
        'id': 'Id',
        'user_name': 'UserName',
        'full_name': 'FullName',
        'email': 'Email',
        'phone_number': 'PhoneNumber',
        'culture_name': 'CultureName',
        'role_name': 'RoleName',
        'is_locked': 'IsLocked',
        'is_data_restricted': 'IsDataRestricted'
    }

    def __init__(self, id=None, user_name=None, full_name=None, email=None, phone_number=None, culture_name=None, role_name=None, is_locked=None, is_data_restricted=None):  # noqa: E501
        """ConsumerData - a model defined in Swagger"""  # noqa: E501

        self._id = None
        self._user_name = None
        self._full_name = None
        self._email = None
        self._phone_number = None
        self._culture_name = None
        self._role_name = None
        self._is_locked = None
        self._is_data_restricted = None
        self.discriminator = None

        if id is not None:
            self.id = id
        if user_name is not None:
            self.user_name = user_name
        if full_name is not None:
            self.full_name = full_name
        if email is not None:
            self.email = email
        if phone_number is not None:
            self.phone_number = phone_number
        if culture_name is not None:
            self.culture_name = culture_name
        if role_name is not None:
            self.role_name = role_name
        self.is_locked = is_locked
        self.is_data_restricted = is_data_restricted

    @property
    def id(self):
        """Gets the id of this ConsumerData.  # noqa: E501


        :return: The id of this ConsumerData.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this ConsumerData.


        :param id: The id of this ConsumerData.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def user_name(self):
        """Gets the user_name of this ConsumerData.  # noqa: E501


        :return: The user_name of this ConsumerData.  # noqa: E501
        :rtype: str
        """
        return self._user_name

    @user_name.setter
    def user_name(self, user_name):
        """Sets the user_name of this ConsumerData.


        :param user_name: The user_name of this ConsumerData.  # noqa: E501
        :type: str
        """

        self._user_name = user_name

    @property
    def full_name(self):
        """Gets the full_name of this ConsumerData.  # noqa: E501


        :return: The full_name of this ConsumerData.  # noqa: E501
        :rtype: str
        """
        return self._full_name

    @full_name.setter
    def full_name(self, full_name):
        """Sets the full_name of this ConsumerData.


        :param full_name: The full_name of this ConsumerData.  # noqa: E501
        :type: str
        """

        self._full_name = full_name

    @property
    def email(self):
        """Gets the email of this ConsumerData.  # noqa: E501


        :return: The email of this ConsumerData.  # noqa: E501
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email):
        """Sets the email of this ConsumerData.


        :param email: The email of this ConsumerData.  # noqa: E501
        :type: str
        """

        self._email = email

    @property
    def phone_number(self):
        """Gets the phone_number of this ConsumerData.  # noqa: E501


        :return: The phone_number of this ConsumerData.  # noqa: E501
        :rtype: str
        """
        return self._phone_number

    @phone_number.setter
    def phone_number(self, phone_number):
        """Sets the phone_number of this ConsumerData.


        :param phone_number: The phone_number of this ConsumerData.  # noqa: E501
        :type: str
        """

        self._phone_number = phone_number

    @property
    def culture_name(self):
        """Gets the culture_name of this ConsumerData.  # noqa: E501


        :return: The culture_name of this ConsumerData.  # noqa: E501
        :rtype: str
        """
        return self._culture_name

    @culture_name.setter
    def culture_name(self, culture_name):
        """Sets the culture_name of this ConsumerData.


        :param culture_name: The culture_name of this ConsumerData.  # noqa: E501
        :type: str
        """

        self._culture_name = culture_name

    @property
    def role_name(self):
        """Gets the role_name of this ConsumerData.  # noqa: E501


        :return: The role_name of this ConsumerData.  # noqa: E501
        :rtype: str
        """
        return self._role_name

    @role_name.setter
    def role_name(self, role_name):
        """Sets the role_name of this ConsumerData.


        :param role_name: The role_name of this ConsumerData.  # noqa: E501
        :type: str
        """

        self._role_name = role_name

    @property
    def is_locked(self):
        """Gets the is_locked of this ConsumerData.  # noqa: E501


        :return: The is_locked of this ConsumerData.  # noqa: E501
        :rtype: bool
        """
        return self._is_locked

    @is_locked.setter
    def is_locked(self, is_locked):
        """Sets the is_locked of this ConsumerData.


        :param is_locked: The is_locked of this ConsumerData.  # noqa: E501
        :type: bool
        """
        if is_locked is None:
            raise ValueError("Invalid value for `is_locked`, must not be `None`")  # noqa: E501

        self._is_locked = is_locked

    @property
    def is_data_restricted(self):
        """Gets the is_data_restricted of this ConsumerData.  # noqa: E501


        :return: The is_data_restricted of this ConsumerData.  # noqa: E501
        :rtype: bool
        """
        return self._is_data_restricted

    @is_data_restricted.setter
    def is_data_restricted(self, is_data_restricted):
        """Sets the is_data_restricted of this ConsumerData.


        :param is_data_restricted: The is_data_restricted of this ConsumerData.  # noqa: E501
        :type: bool
        """
        if is_data_restricted is None:
            raise ValueError("Invalid value for `is_data_restricted`, must not be `None`")  # noqa: E501

        self._is_data_restricted = is_data_restricted

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
        if issubclass(ConsumerData, dict):
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
        if not isinstance(other, ConsumerData):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
