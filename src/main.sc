require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.11234

    state: Приветствие
        intent!: /привет
        a: Привет привет

    state: Прощание
        intent!: /пока
        a: Пока пока
        
    state: Список
        q!: список
        CardList:
            listTitle = заголовок
            listSubtitle = подзаголовок
            listItems = [{"title":"ячейка 1 заголовок","value":"ячейка 1 значение","subtitle":"ячейка 1 подзаголовок","iconUrl":"","hash":"","action":{"then":"/ячейка1","name":"ячейка 1 заголовок"}},{"title":"ячейка 2 заголовок","value":"ячейка 2 значение","subtitle":"ячейка 2 подзаголовок","iconUrl":"","hash":"","action":{"then":"/ячейка2","name":"ячейка 2 заголовок"}},{"title":"ячейка 3 заголовок","value":"ячейка 3 значение","subtitle":"ячейка 3 подзаголовок","iconUrl":"","hash":"","action":{"then":"/ячейка3","name":"ячейка 3 заголовок"}}]
            button = {"name":"кнопка","enabled":false,"transition":"/ячейка1","url":""}

    state: ячейка1
        q!: ячейка1
        a: переход по ячейке1
        
    state: ячейка2
        q!: ячейка2
        a: переход по ячейке2
        
    state: ячейка3
        q!: ячейка3
        a: переход по ячейке3
        
    state: кнопка
        q!: кнопка
        a: переход по кнопке

    state: Fallback
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

