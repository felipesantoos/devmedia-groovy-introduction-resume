singleQuotes = 'This is a single-quoted string.'

name = "double-quoted string"
doubleQuotes = "This is a ${name}."

anotherName = 'triple double-quoted string'
tripleDoubleQuotes = """
    This is a ${anotherName},
    used for multiline
    strings.
"""

println(singleQuotes)
println(doubleQuotes)
println(tripleDoubleQuotes)
