def remove_fourth_character(word: str) -> str:
    
    before_third=word[:3]
    after_third=word[4:]

    return before_third+ after_third


# do not modify below this line
print(remove_fourth_character("NeetCode"))
print(remove_fourth_character("Hello"))