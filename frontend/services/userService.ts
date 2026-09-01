import { api } from "./api";
import { User } from "@/types/types";

export async function getUsers(): Promise<User[]> {
    const response = await api.get<User[]>("/users");

    return response.data;
}

export async function searchUsersByName(name: string): Promise<User[]> {
    const response = await api.get<User[]>("/users/search/name", {
        params: {
            name: name
        }
    });

    return response.data;
}