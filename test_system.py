#!/usr/bin/python3

import requests
import pytest
import json

MSE_AUTH = "Basic YWRtaW46MTIzNA=="
CMU_AUTH = "Basic YWRtaW46NTY3OA=="

def test_mse_get():
    r = requests.get("http://localhost:8085/hey")
    assert(r.status_code == 404)
