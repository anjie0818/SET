from flask import Flask, request, make_response, jsonify

server_internal_error_data = {
    "code": "500",
    "message": "Server internal error."
}

app = Flask(__name__)


@app.route('/', methods=['GET'], strict_slashes=False)
def index():
    return 'Hello World'


@app.route("/alarm", methods=['POST'])
def alarm():
    try:
        raw_data = request.get_data(as_text=True)
        print(raw_data)

        # 这里可以添加处理告警的代码

        return make_response("ok", '200')
    except Exception as ex:
        print(ex.msg)
        return make_response(jsonify(server_internal_error_data), '500')


if __name__ == "__main__":
    app.run(port=1101, debug=True, host='0.0.0.0')